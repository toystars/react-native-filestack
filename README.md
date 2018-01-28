# react-native-filestack

[![npm](https://img.shields.io/npm/v/react-native-filestack.svg)](https://www.npmjs.com/package/react-native-filestack) [![Downloads](https://img.shields.io/npm/dt/react-native-filestack.svg)](https://www.npmjs.com/package/react-native-filestack) [![Licence](https://img.shields.io/npm/l/react-native-filestack.svg)](https://www.npmjs.com/package/react-native-filestack)

> FileStack implementation for react-native

## Getting started

`$ yarn add react-native-filestack` or `$ npm install react-native-filestack --save`

### Mostly automatic installation

`$ react-native link react-native-filestack`


### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-filestack` and add `RNFileStack.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNFileStack.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.bmustapha.RNFileStackPackage;` to the imports at the top of the file
  - Add `new RNFileStackPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-filestack'
  	project(':react-native-filestack').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-filestack/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-filestack')
  	```

## Usage
```javascript
import RNFileStack from 'react-native-filestack';

// TODO: What to do with the module?
```
