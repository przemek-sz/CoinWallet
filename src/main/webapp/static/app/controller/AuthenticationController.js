var app = angular.module('app')


app.controller('AuthenticationController',['$rootScope', '$location','TestService','AuthenticationService',function($rootScope, $location,TestService,AuthenticationService) {
    var vm = this;
    vm.credentials = {};
    var loginSuccess = function() {
        $rootScope.authenticated = true;
        $location.path('/userlist');
    }
    vm.login = function() {
        console.log('login');
        TestService.testFun();
        AuthenticationService.authenticate(vm.credentials,loginSuccess);
    }

    var logoutSuccess = function() {
        $rootScope.authenticated = false;
        $location.path('/');
    }
    vm.logout = function() {
        console.log('LogoutContr');
        AuthenticationService.logout(logoutSuccess);
    }
}])