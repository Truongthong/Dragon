document.addEventListener("DOMContentLoaded", function(event) {
    var inputSearch = document.getElementById("keyword");
    inputSearch.onkeydown = function(event) {
        if (event.keyCode == 13) {
            loadWeather(this.value);
        }
    }
    loadWeather("hanoi");
});


function loadWeather(keyword) {
    var weather_API = "https://api.openweathermap.org/data/2.5/weather?q="+keyword+"&appid=96381a872b1b405c5bf83b2ed63d9561&units=metric";//
    console.log(weather_API);

    var xhr = new XMLHttpRequest();

    xhr.open("GET" , weather_API , true);
    xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200){
            var responseJson = JSON.parse(this.responseText);

            var htmlContent = "";

            for (var i=0 ; i< responseJson.weather.length; i++) {

                var name = responseJson.name;
                var Description = responseJson.weather[i].description;
                var icon = responseJson.weather[i].icon;
                var temp = responseJson.main.temp;
                var lon = responseJson.coord.lon;
                var lat = responseJson.coord.lat;
                var humidity = responseJson.main.humidity;
                var speed = responseJson.wind.speed;
                var clouds= responseJson.clouds.all;
                htmlContent += `<div class="title"><b>${name}</b></div>`

                htmlContent += '<div class="lon">lon: ' + lon + '</div>'
                htmlContent += '<div class="lat">lat: ' + lat + '</div>'

                // htmlContent += '<div class="title"><b>' + name + '</b></div>'
                htmlContent += '<div class="d-flex"><div><img id="img" src="http://openweathermap.org/img/w/' +icon+ '.png"></div>'

                htmlContent += '<div class="temp"><b>' + temp + '<sup>o</sup>C</b></div></div>'
                htmlContent += '<div class="description"><b>description:</b>  ' + Description + '</div>'
                htmlContent += '<div class="clouds">Clouds: ' + clouds + '%</div>'



                htmlContent += '<div id="color"><div class="humidity">humidity: ' + humidity + '%</div>'
                htmlContent += '<div class="speed">Wind: ' + speed + 'm/s</div>'
                htmlContent += '<div class="pressure">Pressure: ' + responseJson.main.pressure + 'hpa</div></div>'

                htmlContent += '</div>'
            }
            document.getElementById("weather").innerHTML = htmlContent;
        }else if(this.readyState == 4) {
            console.log("Fails");
        }
    };
    xhr.send();
}

