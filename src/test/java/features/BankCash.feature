Feature: Techfios bank and cash New Account Functionality

  Scenario Outline: User should be able to login with valid credentials and open a new account
    Given user is on the techfios login page
    When user enters the username as "demo@techfios.com"
    When user enters the password as "abc123"
    And user clicks on login
    Then user should land on Dashboard page
    And user clicks on bankCash
    And user clicks on newAccount
    And user fills  the new Account Details in the New Account page "<AccountTitle>","<Description>","<InitialBalance>","<AccountNumber>","<contactPerson>","<Phone>","<InternetBankingURL>"
    And user clicks on submit
    Then User should be able to validate account created successfully

    Examples: 
      | AccountTitle | Description           | InitialBalance | AccountNumber | contactPerson | Phone     | InternetBankingURL            |
      | My Account   | This is dummy account |           1000 |     123456789 | TC            | 222-123-4 | https://www.bankofamerica.com |
