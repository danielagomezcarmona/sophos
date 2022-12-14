Feature: Interactuar con las ventanas emergentes en Alerts de la opcion de Alerts en la aplicacion web de DemoQA

  Scenario: Abrir y cerrar las ventanas emergentes en la opcion de Alerts de manera exitosa
    Given El cliente esta ubicado en la pagina de inicio
    When Selecciona la opcion de Alerts, Frame y Windows
    And Selecciona la opcion de Alerts
    Then Selecciona el primer boton y cierra la ventana emergente
    And Selecciona el segundo boton y cierra la ventana emergente
    And Selecciona el tercer boton y cierra la ventana emergente
    And Selecciona el cuarto boton ingresa el nombre y cierra la ventana emergente
    And Verifica de manera exitosa el dato




