# Autor: Diannys Granadillo
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Nany wants to learn automation at the academy choucair
    | strUser   | strPassword   |
    | 1121044269 | Choucair2021*   |
    When he search for the course on the choucair academy platform
    | strCourse                 |
    | Foundation Express  |
    Then he finds the course called
    | strCourse                 |
    | Foundation Express     |