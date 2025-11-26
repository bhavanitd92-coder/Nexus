Feature: verifying booking conformation

  Scenario Outline: Verifying 7 error msg is displayed
    Given User is in the adactin url
    When User should enter username and password
    And User should click login button
    Then enter datas
      | location | Melbourne |
      | hotels   |         4 |
      | room     | Double    |
    And select datas
      | norooms | datein     | dateout    | adultroom |
      | 1 - one | 11/11/2021 | 15/11/2021 | 2 - two   |
      | 2 - Two | 13/11/2021 |            |           |
      |         |            |            | 1 - One   |
    And User should click search button
    And select radiobutton
    Then User should click booking button
    And User should get error msg

    Examples: 
      | firstname | lastname | address   | cc               | cctype | ccexp | ccyear | ccv |
      | ramesh    | kumar    | kalpakkam | 1212139876543213 | VISA   | March |   2018 | 124 |
