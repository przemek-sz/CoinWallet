var app = angular.module('app')

app.controller('UserController',function ($http) {

    var vm=this;
    getUsersList();
    ///////////////////////////////////////////////////////////////////
    vm.addUser=function (user) {

        $http({
            method:"POST",
            url:'/api/user',
            data:user
        }).then(function succes() {
            vm.userForm.$setPristine();

        },function error() {

        });



    };
    //////////////////////////////////////////////////////////////////////
    vm.resetForm=function () {
        vm.userForm.$setPristine();

    }
    //////////////////////////////////////////////////////////////////////
    function getUsersList() {

        $http({
            method:'GET',
            url:'/api/user'
        }).then(function succes(response) {
            vm.users=response.data;
        },function error(response) {

        });
    };
    //////////////////////////////////////////////////////////////////////
});
