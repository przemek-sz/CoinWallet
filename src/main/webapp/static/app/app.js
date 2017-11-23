var app = angular.module('app', ['ngRoute']);

app.config(function ($routeProvider,$httpProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'static/partials/mainpage.html'
        })
        .when('/login', {
            templateUrl: 'static/partials/loginpage.html',
            controller:'AuthenticationController',
            controllerAs:'authController'
        })
        .when('/userlist', {
            templateUrl: 'static/partials/userlist.html',
            controller:'UserController',
            controllerAs:'userController'
        })
        .when('/signup', {
            templateUrl: 'static/partials/signup.html'
        })
        .when('/logout', {
            controller:'AuthenticationController',
            controllerAs:'authController'
        });

});

app.config(function ($routeProvider, $httpProvider) {

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
});
