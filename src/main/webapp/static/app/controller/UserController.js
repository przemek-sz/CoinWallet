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
           vm.user=null;
        },function error() {

        });

    };
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
    vm.removeUser=function (userName) {
      console.log(userName);
        $http({
            method:'DELETE',
            url:'/api/user/'+userName
        }).then(function succes(response) {
            getUsersList();

        },function error(response) {

        });

    };
    //====================================================================
    vm.login=function (user) {
        console.log(user);
    }

});
