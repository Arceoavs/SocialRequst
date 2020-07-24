var map;
var pin;
var mapCoordinates;
var tilesURL = 'https://{s}.tile.openstreetmap.fr/hot/{z}/{x}/{y}.png';
var mapAttrib = '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>, Tiles courtesy of <a href="http://hot.openstreetmap.org/" target="_blank">Humanitarian OpenStreetMap Team</a>';

document.addEventListener('DOMContentLoaded', () => {
  var lng = document.getElementById('map').getAttribute('data-lng');
  var lat = document.getElementById('map').getAttribute('data-lat');
  mapCoordinates = [lat,lng];
  createMap();
});

function createMap() {
  // create map instance
  if (!(typeof map == "object")) {
    map = L.map('map', {
      center: mapCoordinates,
      zoom: 14
    });
  }
  else {
    map.setZoom(14).panTo(mapCoordinates);
  }
  // create the tile layer with correct attribution
  L.tileLayer(tilesURL, {
    attribution: mapAttrib,
    maxZoom: 19
  }).addTo(map);

  L.marker(mapCoordinates).addTo(map);
}
