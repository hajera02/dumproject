Feature: This is testing feature

Scenario: Verify user SignUp
Given Launch "<URL>" Applicationss
Then Click on Login
Then Enter UserName PassWord Click Login button
Then verify user can login successfully.

Scenario: Verify Contact Message send
Given Launch "<URL>" Applicationss
Then Click Contact Link
Then Enter Contact email name message
Then Click send message button
Then verify contact message send successfully.
@Framework
Scenario: Verify user Signup2
Given Launch "<URL>" Applicationss
Then Click on Signup
Then Enter Username Password Click Signup button
Then Verify user can signup successfully