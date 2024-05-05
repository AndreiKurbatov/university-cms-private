Feature: Administrator creation
  Administrator logs in and creates a new administrator

  Scenario: Administrator creates a new administrator and the new administrator should be visible for the other users
    Given driver 'http://localhost:8080/login'
    And waitFor('[id=username]')
    And input('[id=username]','admin')
    And input('[id=password]','1234')
    When click('[id=logInButton]')
    And waitFor('[id=administratorsRef]')
    Then match driver.title == 'Home page'
    And match driver.url == 'http://localhost:8080/'
    When click('[id=administratorsRef]')
    Then waitFor('[id=administratorsRef]')
    And match driver.title == 'Administrators'
    And match driver.url == 'http://localhost:8080/administrators'
    When click('[id=administratorCreateRef]')
    Then match driver.title == 'Create administrator'
    And match driver.url == 'http://localhost:8080/administrators/new'
    And input('[id=name]','Andrei Kurbatov')
    And input('[id=gender]', 'Woman')
    And input('[id=birthDate]', '2020-02-20')
    And input('[id=email]', 'kurbatovandre@gmail.com')
    And input('[id=telephoneNumber]', '123412341234')
    And input('[id=residenceAddress]', 'Via Mentana 5525252')
    And input('[id=employmentDate]','2020-02-20')
    And input('[id=position]', 'position')
    And input('[id=workingShift]', 'PART_TIME')
    And input('[id=passportNumber]', '12341234')
    And input('[id=login]', 'asd fols')
    And input('[id=password]', '1234')
    And input('[id=salaryAmount]', '5000')
    And input('[id=currencyMark]', 'USD')
    When submit().click('[id=createAdministratorButton]')
    Then match driver.url == 'http://localhost:8080/administrators'
    And driver 'http://localhost:8080/administrators?page=2&size=10'
    * def table = locate('.table-responsive-md.table.table-hover.table-striped.my-custom-table')
    * def rows = table.locateAll('[id=rowButton]')
    * match karate.sizeOf(rows) == 1









