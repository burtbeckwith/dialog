class DialogGrailsPlugin {
    // the plugin version
    def version = "2.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.1.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
			"grails-app/domain/org/open_t/dialog/demo/Demo.groovy",
			"grails-app/domain/org/open_t/dialog/demo/DemoItem.groovy",
			"grails-app/controllers/org/open_t/dialog/demo/DemoController.groovy",
			"grails-app/controllers/org/open_t/dialog/demo/DemoItemController.groovy",			
			"grails-app/views/demo/dialog.gsp",
			"grails-app/views/demoItem/dialog.gsp"
    ]

    // TODO Fill in these fields
    def author = "Joost Horward"
    def authorEmail = ""
    def title = "Dialog"
    def description = '''\\
Provides easy-to-maintain CRUD dialogs and lists with JQuery and twitter bootstrap.
'''

    // URL to the plugin's documentation
    def documentation = "http://www.open-t.nl/p/projects/dialog"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
