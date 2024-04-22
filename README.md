# Getting Started

### Reference Documentation

- https://docs.spring.io/spring-modulith/reference/fundamentals.html

### Other Examples

- https://github.com/spring-projects/spring-modulith/tree/main/spring-modulith-examples/spring-modulith-example-full
- https://github.com/predic8/spring-modulith-demo

### Verify Module Dependencies

- run testcase (ArchUnit under the hood)

### This Demo

- packages next to the main class are called modules
  - e.g. inventory and order
- this level is the api package, that means the modul can be referred from another modul
  - e.g. OrderApi can be called from somewhere inside inventory (InventoryApi, InventoryManagement)
- sub-packages are by default internal, so it can not be referred to from other modules
  - e.g. OrderManagement can not be called from somewhere inside inventory (InventoryApi, InventoryManagement)
- to allow references, you need to expose this package via NamedInterface in package-info
  - e.g. order_statistics
- and then add this name to the ApplicationModule-allowedDependencies of the caller package-info
  - e.g. inventory.management -> allowedDependencies = {"order", "order::order_statistics"} 
  - now it is no longer the default (api package), so you also have to name this package in the array
- inside one modul you don't have to allow dependencies to other classes (also in private sub-packages)
  - e.g. OrderManagement can call OrderStatistics
- but try to mark many classes with package-private (no modifier) to hide them for others
  - e.g. OrderHandler can only be called from OrderManagement, not visible for any other class in the project