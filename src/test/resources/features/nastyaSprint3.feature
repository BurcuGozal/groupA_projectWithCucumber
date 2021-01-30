Feature: Verify Car Specifications

	Scenario: Verify Car Specifications
		Given The user is on the main page and clicks on See more cars
		When The user chooses the car
		Then The user should see all the features
		|	Power Locks					|
		|	Rear Defroster				|
		|	Auxiliary Audio Input		|
		|	AM/FM Stereo				|
		|	Cruise Control				|
		|	Panoramic Sunroof			|
		
		
		
		
		And The user should see all the specificatons
		|	City/Highway Gas Mileage	|
		|	Exterior/Interior Color		|
		|	Transmission				|
		|	Drive						|
		|	Engine						|
		|	Cylinders					|
		|	Horsepower					|
		|	Torque						|
		|	Prior Use					|
		