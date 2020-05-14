document.addEventListener('DOMContentLoaded', () => {
  initializeNavbar();
  initializeFlashMessages();
});

function initializeNavbar() {
  const $navbarBurgers = Array.prototype.slice.call(document.querySelectorAll('.navbar-burger'), 0);

  if ($navbarBurgers.length > 0) {
    $navbarBurgers.forEach( el => {
      el.addEventListener('click', () => {
        const target = el.dataset.target;
        const $target = document.getElementById(target);
        el.classList.toggle('is-active');
        $target.classList.toggle('is-active');
      });
    });
  }
}

function initializeFlashMessages() {
  const flashMessages = document.querySelectorAll('.flash-message');

  if (flashMessages.length > 0) {
    flashMessages.forEach((el) => {
      setTimeout(() => el.remove(), 3000);

      el.querySelector('.delete').addEventListener('click', () => {
        el.remove();
      });
    })
  }
}
