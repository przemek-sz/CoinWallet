var app = angular.module('app',[ngRoute])

app.config(function ($routeProvider) {
    $routeProvider.when('/loginpage',{
        templateUrl:'partials/loginpage.html'
    });

})