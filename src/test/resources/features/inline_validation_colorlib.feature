@colorlib
Feature: Test Inline Validation form

  Background: User is Logged In
    Given I am logged in the app, with credentials:
      | demo | demo |
    And I go to Inline Validation

  Scenario Outline: successful validation
    When I fill the Inline Validation form
      | required   | email  | password  | confirmPassword  | date  | url  | minimumChars  | maximumChars  | minimum | maximum | isAgreeToPolicy |
      | <required> |<email> | <password>| <confirmPassword>| <date>|<url> |<minimumChars> |<maximumChars> |<minimum> | <maximum> | <isAgreeToPolicy> |
    Then I see the successful messages in Inline Validation

    Examples:
      | required | email  | password  | confirmPassword  | date  | url  | minimumChars  | maximumChars  | minimum | maximum | isAgreeToPolicy |
      | Cosa    | test@test.co  | 123456  | 123456  | 17081995  | http://google.com  | abc |abcde |4 | 15 | true |

  Scenario Outline: failed validation
    When I fill the Inline Validation form
      | required   | email  | password  | confirmPassword  | date  | url  | minimumChars  | maximumChars  | minimum | maximum | isAgreeToPolicy |
      | <required> |<email> | <password>| <confirmPassword>| <date>|<url> |<minimumChars> |<maximumChars> |<minimum> | <maximum> | <isAgreeToPolicy> |
    Then I see the error messages in Inline Validation

    Examples:
      | required | email  | password  | confirmPassword  | date  | url  | minimumChars  | maximumChars  | minimum | maximum | isAgreeToPolicy |
      | Cosa    |  | 123456  | 123456  |   | http://google.com  |  |abcde |4 | 15 | true |