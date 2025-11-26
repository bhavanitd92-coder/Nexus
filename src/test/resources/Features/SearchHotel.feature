Feature: verifying adactin details

  Scenario Outline: Verification of search hotel with valid credential
    Given User is in the adactin url
    When User should enter "<username>","<password>"
    Then User should verify "search hotel" is displayed

    Examples: 
      | username   | password |
      | ramesh1995 | W0K010   |

  #Scenario Outline: Verification of please select a location msg
    #Given User is in the adactin url
    #When User should enter "<username>","<password>"
    #And User should click search button
    #Then User should verify "please select a location" msg is displayed
#
    #Examples: 
      #| username   | password |
      #| ramesh1995 | W0K010   |
#
  #Scenario Outline: Verification of select hotel with valid credential
    #Given User is in the adactin url
    #When User should enter "<username>","<password>"
    #Then enter datas "<location>" ,"<room>","<norooms>","<datein>","<dateout>","<adultroom>"
    #Then User should verify "select hotel" msg is displayed
#
    #Examples: 
      #| username   | password | location | hotels | room   | norooms | datein     | dateout    | adultroom | firstname | lastname | address   | cc               | cctype | ccexp | ccyear | ccv |
      #| ramesh1995 | W0K010   |        3 |      4 | Double | 2 - Two | 14/11/2021 | 13/11/2021 | 1 - One   | ramesh    | kumar    | kalpakkam | 1212139876543213 | VISA   | March |   2018 | 124 |
#
  #Scenario Outline: Verification of checkin and checkout date with selecting all field
    #Given User is in the adactin url
    #When User should enter "<username>","<password>"
    #Then enter datas "<location>" ,"<hotels>","<room>"
    #And select datas "<norooms>","<datein>","<dateout>","<adultroom>"
    #And User should click search button
    #Then User should verify "check in date should be before than check out date" is displayed
#
    #Examples: 
      #| username   | password | location | hotels | room   | norooms | datein     | dateout    | adultroom | firstname | lastname | address   | cc               | cctype | ccexp | ccyear | ccv |
      #| ramesh1995 | W0K010   |        3 |      4 | Double | 2 - Two | 14/11/2021 | 13/11/2021 | 1 - One   | ramesh    | kumar    | kalpakkam | 1212139876543213 | VISA   | March |   2018 | 124 |
