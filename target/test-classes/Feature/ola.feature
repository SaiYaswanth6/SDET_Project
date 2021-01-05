Feature: Validate the fields in OLA Contact Us page

  Background: Open the url in the browser
    Given User Navigates to ola contact us page

  Scenario Outline: Enter the proper name in Name Text Field
    When User Enter name in "<name>" and click on submit
    Then Validate the Text box field "<name>"

    Examples: 
      | name                                                                                                     |
      | Sai Yaswanth                                                                                             |
      | ahskdahsdhjashdkajsdkjahsdahsdkjahsdkjashdkjahsdkahsdkjhaskjdhakjsdhakjshdkjahsdkjahsdjkahsdkjhasdkjhaas |

  Scenario Outline: Enter the valid  mail id in email Text Field
    When User Enter email id in "<email>" and click on submit
    Then Validate the mail box field "<email>"

    Examples: 
      | email                 |
      | saiyaswanth@gmail.com |
      | invalidmailid         |

  Scenario Outline: Enter the valid  mobile number in mobile number Text Field
    When User Enter mmobile number "<mobile>" and click on submit
    Then Validate the mobile number field "<mobile>"

    Examples: 
      | mobile                |
      | saiyaswanth@gmail.com |
      |            9966338855 |
