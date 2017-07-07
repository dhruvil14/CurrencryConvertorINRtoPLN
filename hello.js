angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/INRtoPLN?INR=35').
        then(function(response) {
            $scope.greeting = response.data;
        });
});
