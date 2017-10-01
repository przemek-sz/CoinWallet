var app = angular.module('app')

app.controller('UserController',function ($http) {

    var vm=this;
    ///////////////////////////////////////////////////////////////////
    vm.addUser=function (user) {

        $http({
            method:"POST",
            url:'/api/user',
            data:user
        }).then(function succes() {

        },function error() {

        });
    };
    //////////////////////////////////////////////////////////////////////
});
