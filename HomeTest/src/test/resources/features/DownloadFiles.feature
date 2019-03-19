Feature: Download files from Windows page


Scenario: Download a file using the file name
	Given user is in the home page
  	When the user download the desired files pasing the file title "Dynamic Update for Windows 10 Version Next (Build 15010) for x64-based Systems"
  	Then the user must be able to see the downloaded files within the corresponding directory

  	
  Scenario: Download a file using the file id
	Given user is in the home page
  	When the user download the desired files pasing the file id 9999004
  	Then the user must be able to see the downloaded files within the corresponding directory

