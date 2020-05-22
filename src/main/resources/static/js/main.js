document.addEventListener('DOMContentLoaded', () => {
  initializeNavbar();
  initializeFlashMessages();
  initializeSearch();
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
      setTimeout(() => el.remove(), 5000);

      el.querySelector('.delete').addEventListener('click', () => {
        el.remove();
      });
    })
  }
}

function initializeSearch() {
  const $searchForm = document.querySelector('form#search-form');
  const $searchSpecialties = document.querySelector('button#specialties-search');
  if (!$searchForm || !$searchSpecialties) return;

  let $resultsWrapper = document.querySelector('#search-results-wrapper');
  // add loading spinner
  let $spinner = `
    <div class="sk-circle" style="left: 50%;">
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
      <div class="sk-circle-dot"></div>
    </div>
  `;

  $searchForm.addEventListener('submit', async (e) => {
    e.preventDefault();

    $resultsWrapper.innerHTML = $spinner;

    let url = new URL($searchForm.action);
    console.log(url);
    url.search = new URLSearchParams({ q: $searchForm.querySelector('[name="q"]').value });

    try {
      const response = await fetch(url);
      $resultsWrapper.innerHTML = await response.text();
    } catch(error) {
      console.log('Something went wrong', error);
      createFlashMessage('error', `Something went wrong: ${error}`)
    }
  });

  $searchSpecialties.addEventListener('click', async (e) => {
    e.preventDefault();

    $resultsWrapper.innerHTML = $spinner;

    let url = new URL("http://localhost:8080/search/matching-specialties");
    try {
      const response = await fetch(url);
      $resultsWrapper.innerHTML = await response.text();
    } catch(error) {
      console.log('Something went wrong', error);
      createFlashMessage('error', `Something went wrong: ${error}`)
    }
  });
}

function createFlashMessage(type, message) {
  let flashMessage = document.createElement('div');
  flashMessage.classList.add(['flash-message', 'notification']);
  switch (type) {
    case 'success':
      flashMessage.classList.add('is-success');
      break;
    case 'error':
      flashMessage.classList.add('is-danger');
      break;
    default:
      flashMessage.classList.add('is-info');
      break;
  }

  flashMessage.innerHTML = `
    <button class="delete"></button>
    <span>${message}</span>
  `;

  document.body.prepend(flashMessage);
  setTimeout(() => flashMessage.remove(), 5000);
  flashMessage.querySelector('.delete').addEventListener('click', () => flashMessage.remove());
}
