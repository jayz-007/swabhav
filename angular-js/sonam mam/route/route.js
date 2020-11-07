var routeApp = angular.module("routeApp", ["ngRoute"]);
routeApp.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl: 'welcome.html',
        controller: 'homeController'
    })
    .when("/career", {
        templateUrl : 'about.html',
        controller: 'aboutController'
    })
    .when("/about", {
        templateUrl : 'career.html',
        controller: 'careerController'
    })
    
});

routeApp.controller('homeController',function($scope){
  
    $scope.message = "This is home page"
})
routeApp.controller('aboutController',function($scope){
    $scope.message = "this is about page"
})
routeApp.controller('careerController',function($scope){
    $scope.message = "this is career page"
})