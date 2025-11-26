Feature: cancel the booking order id

  #Scenario Outline: Verification of booked hotel cancellation
    #Given User is in the adactin page
    #When User should enter "<userName>","<password>"
    #And User should click the book itinerary
    #Then User should select and cancel the orders
      #| 1jgfhj657 |
      #| jgffhhhj2 |
    #Then User should verify "the booking has been cancelled." is displayed
#
    #Examples: 
      #| userName   | password |
      #| ramesh1995 | W0K010   |
 #
  #Scenario Outline: User should cancel the current booking id
    #Given User is in the adactin page
  
    When User should enter "<userName>","<password>" for login
    Then enter datas "<location>" ,"<hotels>","<room>"
    And select datas "<norooms>","<datein>","<dateout>","<adultRoom>"
    
    Then select radiobutton
    Then enter datas "<firstName>","<lastName>","<address>"
      | creditCard       | ccType           | expiryMonth | expiryYear | ccv |
      | 1234567890122453 | VISA             | July        |    2011 | 132 |
      | 7363553667778765 | American Express | June        |    2012 | 765 |
      | 8976677567789876 | Master Card      | August      |    2015 | 652 |
      | 8773365635467523 | Other            | October     |    2017 | 654 |
    
    Then User should select and cancel the order
    Then User should verify "the booking has been cancelled." is displayed

    Examples: 
      | userName   | password | location | hotels | room   | norooms | datein     | dateout    | adultroom | firstName | lastName | address   |
      | ramesh1995 | W0K01    |        3 |      4 | Double | 2 - Two | 12/11/2021 | 13/11/2021 | 1 - One   | ramesh    | kumar    | kalpakkam |
      
      @ram
       Scenario: User should cancel the current booking id
    Given User is in the adactin page
