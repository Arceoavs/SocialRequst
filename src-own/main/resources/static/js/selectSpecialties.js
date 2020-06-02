document.addEventListener('DOMContentLoaded', () => {
  $('#select-specialties').select2({
    multiple: true,
    placeholder: 'Specialties',
    width: '100%',
    tags: false,
  });
});
