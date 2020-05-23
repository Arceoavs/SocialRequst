document.addEventListener('DOMContentLoaded', () => {
  $('#select-topics').select2({
    multiple: true,
    placeholder: 'Topics',
    width: '100%',
    tags: true,
    createTag(params) {
      if (params.term.match("^[a-z0-9]+$") == null) {
        return null;
      }
      
      return {
        id: params.term,
        text: params.term,
      };
    },
  });
});
