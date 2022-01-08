// Here is the groovy file for screen elements
info("Genshin Impact Resourcepack")

resPath="config/slightguimodifications/Genshin Impact Resourcepack/"


mainMenu {
    enabled = true // Set to true to enable this module

    splashText {
        enabled = true // Set to true to enable this module
        splashesEnabled = false // Set to false to disable splashes entirely
        customSplashes {
            enabled = false // Set to true to enable this module
            // You can put either "override" or "append" here to declare how you want to provide custom splashes
            applyMode = "override"
            defineCustom(["Wood", "Potato", "Stone"])
        }
    }

    background {
        clearBackgrounds() // This line removes the rotating cube
        backgroundStayLength = 10000 // This sets the length a background would stay
        backgroundFadeLength = 10000 // This sets the fade duration to another background
        renderGradientShade = false // This sets whether the slight shade should be rendered
        image {
            texture = file(resPath + "background_nodoor.png") // Remember to use forward slash to support unix!
            //texture = resource("slightguimodifications:background.png") // Here to use a resource location / identifier
        }
    }

    // Uncomment these to remove aspects of the title screen
    removeMinecraftLogo()
    removeEditionBadge()

    // Clear all buttons already on screen
    clearAllButtons()

    // Clear all labels already on screen
    clearAllLabels()

    label {
        position {
            x = 2
            y { it - 9 }
        }
    
        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Genshin Impact Resourcepack")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Color of the text, default is 0xFFFFFF
        color = 0x262422
        // Whether the label has a shadow, default is false
        shadow = false
        // Mouse Hovered Color of the text, default is 0xFFFFFF
        hoveredColor = 0x32302E
        // Mouse Click Function, default is nothing, here's a list of options
        //onClicked = nothing()
        //onClicked = url("https://www.google.com")
        //onClicked = modMenu()
        //onClicked = language()
        //onClicked = options()
        //onClicked = exit()
        //onClicked = accessibility()
        //onClicked = singleplayer()
        //onClicked = multiplayer()
        //onClicked = realms()
        onClicked = reloadCts()
    }

    button {
        position {
            x { it / 2 + 4 }
            y { it / 2 - 47 }
        }
        width = 207 / 2.9
        height = 344 / 2.9
    
        // Optional: custom textures
        texture = file(resPath + "button_singleplayer.png") // Remember to use forward slash to support unix!
        //texture = resource("slightguimodifications:epic_button.png") // Here to use a resource location / identifier
        hoveredTexture = file(resPath + "button_singleplayer.png")  // Remember to use forward slash to support unix!
        //hoveredTexture = resource("slightguimodifications:epic_button_hovered.png") // Here to use a resource location / identifier
    
        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "center"
        // Mouse Click Function, default is nothing, look up see the list
        onClicked = singleplayer()
    }

    button {
        position {
            x {it - 20}
            y {it - 120 + 25*0}
        }
        width = 20
        height = 20
        texture = file(resPath + "button_multiplayer.png")
        hoveredTexture = file(resPath + "button_multiplayer_pressed.png")
        text = literal("")
        align = "center"
        onClicked = multiplayer()
    }

    button {
        position {
            x {it - 20}
            y {it - 120 + 25*1}
        }
        width = 20
        height = 20
        texture = file(resPath + "button_options.png")
        hoveredTexture = file(resPath + "button_options_pressed.png")
        text = literal("")
        align = "center"
        onClicked = options()
    }

    button {
        position {
            x { it - 20 }
            y { it - 120 + 25 * 2 }
        }
        width = 20
        height = 20
        texture = file(resPath + "button_mods.png")
        hoveredTexture = file(resPath + "button_mods_pressed.png")
        text = literal("")
        align = "center"
        onClicked = modMenu()
    }

    button {
        position {
            x { it - 20 }
            y { it - 120 + 25 * 3 }
        }
        width = 20
        height = 20
        texture = file(resPath + "button_exit.png")
        hoveredTexture = file(resPath + "button_exit_pressed.png")
        text = literal("")
        align = "center"
        onClicked = exit()
    }
}