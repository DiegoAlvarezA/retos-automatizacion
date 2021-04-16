@colorlib
Feature: Test Block Validation form

  Background: User is Logged In
    Given I am logged in the app, with credentials:
      | demo | demo |
    And I go to Block Validation

  Scenario Outline: successful validation
    When I fill the form
      | required    | email  | password  | confirmPassword  | date  | url  | digits  | range | isAgreeToPolicy |
      | <required>  | <email>  | <password>  | <confirmPassword>  | <date>  | <url>  | <digits>  | <range> | <isAgreeToPolicy> |
    Then I see the successful messages

    Examples:
      | required | email  | password  | confirmPassword  | date  | url  | digits  | range | isAgreeToPolicy |
      | Cosa    | test@test.co  | 123456  | 123456  | 17081995  | http://google.com  | 1  | 7 | true |

  Scenario Outline: failed validation
    When I fill the form
      | required    | email  | password  | confirmPassword  | date  | url  | digits  | range | isAgreeToPolicy |
      | <required>  | <email>  | <password>  | <confirmPassword>  | <date>  | <url>  | <digits>  | <range> | <isAgreeToPolicy> |
    Then I see the error messages

    Examples:
      | required | email  | password  | confirmPassword  | date  | url               | digits | range | isAgreeToPolicy |
      | Cosa     |         | 123456    | 123456           |      | http://google.com  | 1     | 7     | true            |