Feature: Agregar fechas en el Date Picker de la opcion de Widgets en la aplicacion web de DemoQA

  Scenario: Agregar fechas en el Date Picker de la opcion de Widgets de manera exitosa
    Given El cliente esta ubicado en el home
    When Selecciona la opcion de Widgets
    And Selecciona la opcion de Date Picker
    Then Selecciona el campo de Select Date
    And Selecciona una fecha exitosamente
    And Selecciona el campo de Date and Time
    And Selecciona una fecha y hora exitosamente
