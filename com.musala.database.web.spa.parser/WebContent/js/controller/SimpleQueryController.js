app.controller('SimpleQueryController', function($scope, $http) {
	$scope.connect = function() {
		// Logging retrieved query types
		console.log($scope.queriesType);
		$http({
			url : BACKEND_URL,
			method : BACKEND_REQUEST_TYPE_POST,
			headers : {
				'Content-Type' : 'application/json'
			},
			data : {
				'queriesType' : $scope.queriesType,
				'tableName' : $scope.tableName,
				'properties' : $scope.properties,
				'funcRequest' : 'second',
			},
		}).then(function(response) {
			// Logging response data
			console.log(response.data.status);
			console.log(response.data.message);
			if (response.data.status) {
				$scope.message = response.data.message;
				setTimeout(function() {
					window.location.replace('index.html#/extended-querying');
				}, 2000);

			} else {
				$scope.message = response.data.message;
				setTimeout(function() {
					window.location.replace('index.html#/initialization');
				}, 2000);
			}
		})
	}
});