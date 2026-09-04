***

intent: Develop a native Android app for VideoDL with modern Material Design language and Python backend API
success\_criteria:

- Android app with complete UI implemented in Kotlin

- Python FastAPI backend serving video parsing functionality

- Complete video download flow from URL input to file storage

- Modern Material 3 design system implementation

- Background download service using WorkManager

- Proper handling of all platform-specific video sources (45+ platforms)

- FFmpeg/N\_m3u8DL-RE integration for HLS streams

- All tests pass including unit tests, integration tests, and UI tests
  risk\_level: high
  auto\_approve: false

***

## Steps

- [ ] **Step 1: Project Setup and Architecture Design**
  action: Create the Android project structure with Gradle, setup Git repository for new Android App
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: VideodlAndroidApp
  assert:
  kind: exists
  gate: human

- [ ] **Step 2: Create Python FastAPI Backend Structure**
  action: Create backend directory structure for FastAPI server with proper module organization
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: backend
  assert:
  kind: exists

- [ ] **Step 3: Python Backend Core Integration**
  action: Integrate videodl core modules into Python backend, create fastapi endpoints for video parsing
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: cd backend && python -m pytest test\_core.py -v

- [ ] **Step 4: Android Project Initialization**
  action: Initialize Android project with Kotlin, create build.gradle files with required dependencies
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew :app:dependencies

- [ ] **Step 5: Material 3 Design System Setup**
  action: Configure Material 3 theme, color scheme, typography, and components in Android app
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/theme
  assert:
  kind: exists

- [ ] **Step 6: Networking Layer Implementation**
  action: Implement Retrofit networking layer for communicating with Python backend API
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 7: ViewModel Architecture Setup**
  action: Implement MVVM architecture with ViewModels for state management across screens
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 8: Main Activity and Navigation**
  action: Create MainActivity with Bottom Navigation Bar supporting History, Search, Downloads tabs
  loop: false
  max\_iterations: 1
  verify:
  type: browser
  url: localhost
  check: App launches successfully with navigation bar visible

- [ ] **Step 9: Home Screen - Recent Videos**
  action: Implement home screen with RecyclerView displaying recently downloaded videos
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/res/layout/item\_recent\_video.xml
  assert:
  kind: exists

- [ ] **Step 10: Add URL Screen Implementation**
  action: Create AddURLScreen with URL input field, supported platforms list, and history suggestions
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/screens/addurl/AddURLScreen.kt
  assert:
  kind: exists

- [ ] **Step 11: Supported Platforms List Screen**
  action: Create PlatformsScreen displaying all 45+ supported video platforms with icons and descriptions
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/screens/platforms/PlatformsScreen.kt
  assert:
  kind: exists

- [ ] **Step 12: Video Details Screen**
  action: Implement VideoDetailsScreen showing title, thumbnail, quality options, and download button
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/screens/details/VideoDetailsScreen.kt
  assert:
  kind: exists

- [ ] **Step 13: Download Progress Screen**
  action: Create DownloadProgressScreen with progress bar, speed indicator, and pause/resume controls
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/screens/download/DownloadProgressScreen.kt
  assert:
  kind: exists

- [ ] **Step 14: Download History Screen**
  action: Implement DownloadHistoryScreen with completed downloads list, filtering, and sorting
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/screens/history/DownloadHistoryScreen.kt
  assert:
  kind: exists

- [ ] **Step 15: Settings Screen Implementation**
  action: Create SettingsScreen for output directory, quality preference, proxy settings, API endpoint config
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/screens/settings/SettingsScreen.kt
  assert:
  kind: exists

- [ ] **Step 16: Local Database Setup**
  action: Implement Room database for storing downloaded videos, search history, and app preferences
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 17: Data Repository Implementation**
  action: Create repositories for managing data access patterns across all entities
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 18: Video Parser Repository Integration**
  action: Implement VideoParserRepository that communicates with Python backend for video resolution
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 19: MediaStore Integration**
  action: Handle Android MediaStore for saving videos and making them visible in gallery apps
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 20: Background Download Service with WorkManager**
  action: Implement WorkManager workers for background video downloads with retry logic
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 21: Notification Handling**
  action: Create notification channels and manage download notifications with progress updates
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 22: File Download Manager**
  action: Implement robust file downloading with progress tracking, pause/resume, and error handling
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 23: HLS Stream Support**
  action: Integrate ExoPlayer for playing m3u8/HLS streams before download option
  loop: false
  max\_iterations: 1
  verify:
  type: browser
  url: localhost
  check: HLS stream plays correctly in video player

- [ ] **Step 24: Video Thumbnail Generation**
  action: Implement thumbnail extraction from video files using MediaMetadataRetriever or FFmpeg
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 25: Quality Selection Dialog**
  action: Create dialog for selecting video quality (1080p, 720p, 480p) when multiple qualities available
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/src/main/java/com/videodl/ui/components/QualitySelectorDialog.kt
  assert:
  kind: exists

- [ ] **Step 26: Search Functionality**
  action: Implement search across video titles, platforms, and download history
  loop: false
  max\_iterations: 1
  verify:
  type: browser
  url: localhost
  check: Search returns correct results for queries

- [ ] **Step 27: Platform-Specific Parsing**
  action: Ensure proper API calls to backend support all 45+ platform clients with appropriate parameters
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: cd backend && python -m pytest test\_platforms.py -v

- [ ] **Step 28: Error Handling and User Feedback**
  action: Implement comprehensive error handling with user-friendly messages and recovery options
  loop: false
  max\_iterations: 1
  verify:
  type: browser
  url: localhost
  check: Error scenarios display helpful messages and recovery options

- [ ] **Step 29: Permissions Management**
  action: Handle Android permissions for storage, network, and foreground services properly
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 30: Dark Theme Support**
  action: Implement full dark mode following Material 3 guidelines with automatic system sync
  loop: false
  max\_iterations: 1
  verify:
  type: browser
  url: localhost
  check: App displays correctly in both light and dark themes

- [ ] **Step 31: Accessibility Features**
  action: Add content descriptions, TalkBack support, and keyboard navigation for accessibility
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 32: Unit Tests - Network Layer**
  action: Write unit tests for Retrofit API client, response parsing, and error handling
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 33: Unit Tests - Repositories**
  action: Write unit tests for all data repositories with mocked dependencies
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 34: Unit Tests - ViewModels**
  action: Write unit tests for ViewModels covering all state transitions and business logic
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 35: Integration Tests - Download Flow**
  action: Write integration tests for complete download workflow from URL input to file save
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew connectedAndroidTest

- [ ] **Step 36: UI Tests - Critical Paths**
  action: Write Espresso UI tests for main user flows: add URL, parse, download, view history
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew connectedAndroidTest

- [ ] **Step 37: Performance Testing**
  action: Profile app performance, optimize memory usage, reduce startup time, improve scroll performance
  loop: false
  max\_iterations: 3
  verify:
  type: shell
  command: adb shell dumpsys gfxinfo com.videodl.android | grep Frame Timing

- [ ] **Step 38: Battery Optimization**
  action: Optimize battery usage through Doze mode compatibility and efficient background processing
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: adb shell dumpsys batterystats | head -50

- [ ] **Step 39: Security Audit**
  action: Review and implement security best practices, HTTPS enforcement, certificate pinning, secure storage
  loop: true
  until: No critical vulnerabilities found
  max\_iterations: 3
  verify:
  type: shell
  command: ./gradlew detekt

- [ ] **Step 40: FFmpeg Native Libraries Integration**
  action: Bundle FFmpeg binaries for Android, configure for C++ JNI access when needed
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: cd backend && python -c "import ffmpeg; print(ffmpeg.check\_version())"

- [ ] **Step 41: N\_m3u8DL-RE Integration Testing**
  action: Test N\_m3u8DL-RE compatibility with Android environment for protected streams
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: cd backend && python -c "from videodl import videodl; vc = videodl.VideoClient(); result = vc.parsefromurl('<https://www.cctv.com/sample>'); print(result)"

- [ ] **Step 42: Aria2c HTTP API Integration**
  action: Set up aria2c local server and integrate with Android download manager for accelerated downloads
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew lint --variant=debug

- [ ] **Step 43: Proxy and VPN Support**
  action: Implement configurable proxy settings with support for SOCKS5 and HTTP proxies
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew testDebugUnitTest

- [ ] **Step 44: Export/Import Data**
  action: Allow users to export download history as JSON and import from backup files
  loop: false
  max\_iterations: 1
  verify:
  type: browser
  url: localhost
  check: Import/export functionality works correctly

- [ ] **Step 45: Analytics and Crash Reporting**
  action: Integrate Firebase Analytics for usage metrics and Firebase Crashlytics for crash reporting
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: app/google-services.json
  assert:
  kind: exists

- [ ] **Step 46: Performance Profiling and Optimization**
  action: Use Android Profiler to identify bottlenecks and optimize CPU, memory, network, and storage usage
  loop: true
  until: All major performance issues resolved
  max\_iterations: 3
  verify:
  type: shell
  command: adb shell am profile start com.videodl.android > cpu\_profile.txt

- [ ] **Step 47: Documentation and README**
  action: Create comprehensive documentation including installation guide, API documentation, and user manual
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: docs/README\_ANDROID.md
  assert:
  kind: exists

- [ ] **Step 48: Final Testing and QA**
  action: Complete end-to-end testing on multiple devices with different Android versions, fix remaining bugs
  loop: false
  max\_iterations: 1
  verify:
  type: browser
  url: localhost
  check: All features work correctly on test devices

- [ ] **Step 49: Play Store Listing Preparation**
  action: Prepare store listing assets including screenshots, feature graphic, description, privacy policy
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: play-store-assets
  assert:
  kind: exists

- [ ] **Step 50: Release Build and Signing**
  action: Create release build with ProGuard/R8 optimizations, sign with release keystore, generate APK and AAB
  loop: false
  max\_iterations: 1
  verify:
  type: shell
  command: ./gradlew assembleRelease

- [ ] **Step 51: Beta Testing Distribution**
  action: Set up Google Play Internal Testing track and distribute beta builds to testers
  loop: false
  max\_iterations: 1
  verify:
  type: artifact
  path: internal-test-build.apk
  assert:
  kind: exists

- [ ] **Step 52: Public Release Preparation**
  action: Final review, submit to Google Play Production track, prepare launch announcement
  loop: false
  max\_iterations: 1
  verify:
  type: human-review
  gate: human

