var app=angular.module('app');



app.service('UserService',function ($http) {

    var vm=this;

    vm.add=function (user) {

        $http({
            method:POST,
            url:'/api/user',
            data:user
        })

    }


})
