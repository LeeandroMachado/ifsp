let deferredPrompt;
const installButton = document.getElementById("install-button");

window.addEventListener("beforeinstallprompt", e => {
  console.log("beforeinstallprompt");
  deferredPrompt = e;
  installButton.addEventListener('click', install);
});

const install = async () => {
  console.log('install', installButton);
  deferredPrompt.prompt();

  if (deferredPrompt) {
    const result = await deferredPrompt.userChoice();

    if (result.outcome === 'accepted') {
      console.log('INSTALL ACCEPTED');
    } else {
      console.log('INSTALL REJECTED');
    }

    deferredPrompt = null;
  }
}