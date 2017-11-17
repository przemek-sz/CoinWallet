var app=angular.module('app')


app.constant('LOGIN_ENDPOINT', '/login')

app.constant('LOGOUT_ENDPOINT','/logout')

app.service('AuthenticationService', function($http, LOGIN_ENDPOINT,LOGOUT_ENDPOINT) {
    this.authenticate = function(credentials, successCallback) {
        var authHeader = {Authorization: 'Basic ' + btoa(credentials.username+':'+credentials.password)};
        var config = {headers: authHeader};
        $http
            .post(LOGIN_ENDPOINT, {}, config)
            .then(function success(value) {
                successCallback();
            }, function error(reason) {
                console.log('Login error');
                console.log(reason);
            });
    }

    this.logout = function(successCallback) {
        console.log('Logout');
        $http.post(LOGOUT_ENDPOINT)
            .then(successCallback());
    }

})
