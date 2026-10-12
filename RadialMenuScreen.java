GusClient/
├─ build.gradle, settings.gradle, gradle.properties
├─ .github/workflows/build.yml
└─ src/main/
   ├─ resources/fabric.mod.json
   └─ java/gusclient/
      ├─ GusClient.java            (entrypoint + tombol Right Shift)
      ├─ setting/                  (Bool, Number, Mode)
      ├─ module/
      │  ├─ Module, ModuleManager, Category
      │  ├─ movement/  Sprint, AutoWalk, Step
      │  └─ render/    Fullbright, Zoom
      ├─ config/ConfigManager.java (simpan JSON)
      └─ gui/RadialMenuScreen.java (menu roda)
