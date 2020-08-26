let deferredPrompt;
const installButton = document.getElementById("install-button");

window.addEventListener("beforeinstallprompt", e => {
  deferredPrompt = e;
  installButton.addEventListener('click', install);
});

const install = async () => {
  deferredPrompt.prompt();

  const result = await deferredPrompt.userChoice();

  if (result.outcome === 'accepted') {
    console.log('INSTALL ACCEPTED');
  } else {
    console.log('INSTALL REJECTED');
  }

  deferredPrompt = null;
}