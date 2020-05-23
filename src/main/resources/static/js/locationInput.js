var map;
var pin;
var tilesURL = 'https://{s}.tile.openstreetmap.fr/hot/{z}/{x}/{y}.png';
var mapAttrib = '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>, Tiles courtesy of <a href="http://hot.openstreetmap.org/" target="_blank">Humanitarian OpenStreetMap Team</a>';
var mapCoordinates = [51.962944,7.628694];

document.addEventListener('DOMContentLoaded', () => {
  createMap();
  initializeMapEventListeners();
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
}

function movePinToCoordinates (latlng, panToCoordinates = false) {
  document.getElementById('latitude').value = latlng.lat;
  document.getElementById('longitude').value = latlng.lng;
  if (typeof pin == "object") {
    pin.setLatLng(latlng);
  }
  else {
    pin = L.marker(latlng,{  riseOnHover:true,draggable:true });
    pin.addTo(map);
    pin.addEventListener('drag',function(ev) {
      document.getElementById('latitude').value = ev.latlng.lat;
      document.getElementById('longitude').value = ev.latlng.lng;
    });
  }

  if (panToCoordinates) {
    map.flyTo(latlng, 14);
  }
}

function getDeviceLocation() {
  if (!navigator.geolocation){
    console.log("Browser does not support localisation.");
    return;
  }

  document.querySelector('#geolocator').classList.add('is-loading');

  function success(position) {
    var latitude  = position.coords.latitude;
    var longitude = position.coords.longitude;

    movePinToCoordinates(L.latLng(latitude, longitude), panToCoordinates = true);
    document.querySelector('#geolocator').classList.remove('is-loading');
  };

  function error() {
    document.querySelector('#geolocator').classList.remove('is-loading');
    console.log("Device localisation was not possible.");
  };

  navigator.geolocation.getCurrentPosition(success, error);
}

function initializeMapEventListeners() {
  // Map Click event
  map.on('click', function(ev) {
    movePinToCoordinates(ev.latlng);
  });

  // Coordinate Input Events
  // value of changed input can also be accessed by ev.target.value
  document.getElementById('latitude').addEventListener('change', (ev) => {
    var latitude  = document.getElementById('latitude').value;
    var longitude = document.getElementById('longitude').value;

    movePinToCoordinates(L.latLng(latitude, longitude), panToCoordinates = true);
  });

  document.getElementById('longitude').addEventListener('change', (ev) => {
    var latitude  = document.getElementById('latitude').value;
    var longitude = document.getElementById('longitude').value;

    movePinToCoordinates(L.latLng(latitude, longitude), panToCoordinates = true);
  });
}
