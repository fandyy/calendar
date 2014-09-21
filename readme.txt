3.02~3.03
<authentication-provider
user-service-ref="calendarUserDetailsService"/>
1、CalendarUserDetailsService is added to our Spring configuration automatically, since we leverage classpath scanning and the @Component annotation.
2、Create a new class named CalendarUserDetailsService that will make Spring Security aware of our CalendarUser object.
