var app = angular.module('app', ['ngRoute']);

app.config(function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'static/partials/mainpage.html'
        })
        .when('/loginpage', {
            templateUrl: 'static/partials/loginpage.html'
        })
        .when('/userlist', {
            templateUrl: 'static/partials/userlist.html'
        })
        .when('/signup', {
            templateUrl: 'static/partials/signup.html'
        });

});
