# HomeTest

Steps:
1-Use a serenity archetype 
mvn archetype:generate -Dfilter=serenity
You should see some option like this:
net.serenity-bdd:serenity-cucumber-archetype

2-POM will include all the necessary dependencies: JUnit, cucumber, Selenium
3-Install ChromeDriver and configure it in the serenity.properties file