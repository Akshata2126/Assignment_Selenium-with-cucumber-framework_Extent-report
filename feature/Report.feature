Feature: Extent Report

Scenario: Generation of Extent Report for navigating to SAP FIORI demo site
Given Go to the google URL 
When user enter text to search "sap fiori trial" in search text box
And click on first link
Then Sap furi HomePage is displayed take screenshot and attach to Extent report

