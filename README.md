# Hello Neighbor Decorate (Forge 1.20.1)

Dekorasyon modu: Gardirop (`wardrobe`), Komsu Gardirop Demo (`whndemo`) ve dusman mob **Komsu** (`neighbor`).

## Dokular
Dosyalari kendi PNG'lerinle degistirebilirsin (64x64):
- `src/main/resources/assets/hellodecorate/textures/block/wardrobe_texture.png` -> gardirop
- `src/main/resources/assets/hellodecorate/textures/block/whndemo_texture.png` -> whndemo
- `src/main/resources/assets/hellodecorate/textures/entity/neighbor.png` -> komsu (oyuncu skin formati)

## GitHub ile jar build
1. Projeyi GitHub'a yukle (main dalina push).
2. Repo'da **Actions** sekmesi -> **Build Jar**. Her push'ta otomatik calisir; elle calistirmak icin **Run workflow**.
3. Bitince calismanin altindaki **Artifacts > hellodecorate-jar** dosyasini indir; icindeki `.jar` dosyasi `mods` klasorune atilir.

## Yerelde build
Gradle 8.1.1 + JDK 17 ile: `gradle build` -> `build/libs/`.
