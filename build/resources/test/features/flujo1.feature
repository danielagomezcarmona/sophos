Feature: Agregar y quitar registros en la web table de la opcion de Elements en la aplicacion web de DemoQA

   Scenario: Agregar y quitar registros en la web tables de manera exitosa
      Given El cliente esta ubicado en el home de la aplicacion
      When Selecciona la opcion de Elements
      And Selecciona la opcion de Web tables
      And Selecciona agregar registro
      Then Guarda los datos del formulario diligenciado
      And Agrega un registro completo exitosamente
      And Elimina cualquier registro completo exitosamente





