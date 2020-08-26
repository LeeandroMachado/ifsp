if ('serviceWorker' in navigator) {
  window.addEventListener('load', () => {
    navigator.serviceWorker
      .register('/serviceWorker.js')
      .then(res => console.log('service worker registered'))
      .catch(err => console.log('service worker not registered', err))
  })
}

if ('mediaDevices' in navigator) {
  navigator.mediaDevices.enumerateDevices().then(async (devices) => {
    const cameras = devices.filter((device) => device.kind === 'videoinput');

    if (!cameras.length) {
      throw 'No camera found on this device.';
    }

    const camera = cameras[cameras.length - 1];

    try {
      const stream = await navigator.mediaDevices.getUserMedia({
        video: {
          deviceId: camera.deviceId,
          facingMode: ['user', 'environment'],
          height: {ideal: 1080},
          width: {ideal: 1920}
        }
      });

      const track = stream.getVideoTracks()[0];
      const imageCapture = new ImageCapture(track);
      const photoCapabilities = await imageCapture.getPhotoCapabilities();

      const btn = document.getElementById('flash-button');
      btn.addEventListener('click', () => {
        track.applyConstraints({advanced: [{torch: true}]});
      });
    } catch (err) {
      console.log(err);
    }
  });
}