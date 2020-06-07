$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature Files/Ecommerce.feature");
formatter.feature({
  "name": "To add the product to cart in a OurShoppe shopping website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify the user can login to shopping website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to open the url of the web page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "renuviji13@gmail.com",
        "Renu@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify the user can login to shopping website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to open the url of the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_open_the_url_of_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"renuviji13@gmail.com\" and \"Renu@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinitionClass.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the user can search the product in search page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to login to the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_login_to_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to search for \"Iphone 11\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click enter to search the desired product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinitionClass.click_enter_to_search_the_desired_product()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the product is added to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to select and click the desired product",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_select_and_click_the_desired_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click on add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to complete the purchase",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_complete_the_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the address details Select Emirate Select Area,Street Address",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_enter_the_address_details_Select_Emirate_Select_Area_Street_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "place the order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinitionClass.place_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});