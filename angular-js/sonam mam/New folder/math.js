
var application = angular.module('modA', []);
application.factory("MathFactory", function () {
    var MathFactory = {};

    MathFactory.square = function (number) {
        return number*number;
    }
    MathFactory.cube = function (number) {
        return number*number*number;
    }
    return MathFactory;
});
application.controller('SquareController', function ($rootScope, $scope, MathFactory) {
    //$scope.test="test";
    $rootScope.runSquare = function () {
        
        $scope.getValue = MathFactory.square($rootScope.number);
    }
});

application.controller('CubeController', function ($rootScope, $scope, MathFactory) {

    $rootScope.runCube = function () {
        $scope.getValue = MathFactory.cube($rootScope.number);
    }
});