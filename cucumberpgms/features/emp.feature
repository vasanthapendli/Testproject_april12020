Feature: Employee Appraisal process

  I want to use this template for my feature file

 

  Scenario Outline: employee appraisal

    Given the employee name is "<empname>"

    When he gets rating as <rating>

    Then he shall recieve hike percent as <hikepercent>

 

    Examples:

      | empname | rating | hikepercent |

      | sita     |      1 |          90 |

      | gita     |      3 |          80 |