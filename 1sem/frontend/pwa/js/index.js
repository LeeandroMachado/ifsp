const degtorad = Math.PI / 180;

if ('serviceWorker' in navigator) {
  window.addEventListener('load', () => {
    navigator.serviceWorker
      .register('serviceWorker.js')
      .then(res => console.log('service worker registered'))
      .catch(err => console.log('service worker not registered', err))
  })
}

const handleGyroscope = event => {
  const { alpha } = event;
  const compass = document.getElementById('compass');

  compass.style.transform = `rotate(${alpha}deg)`;
  compass.style.webkitTransform = `rotate(${alpha}deg)`;
  compass.style.MozTransform = `rotate(${alpha}deg)`;
};

const requestDeviceOrientation = () => {
  if (typeof DeviceOrientationEvent !== 'undefined' && typeof DeviceOrientationEvent.requestPermission === 'function') {
    DeviceOrientationEvent.requestPermission().then(permissionState => {
      if (permissionState === 'granted') {
        window.addEventListener('deviceorientation', handleGyroscope, true);
      }
    })
  } else {
    window.addEventListener('deviceorientation', handleGyroscope, true);
  }
};

window.addEventListener('DOMContentLoaded', () => {
  const playButton = document.getElementById('play-button');
  playButton.addEventListener('click', requestDeviceOrientation);
});


