# RenewNSell

RenewNSell simplifies the sale of brand-new defective products by connecting brands with buyers seeking discounted items due to faults.

## Class Diagram
![final project (3) drawio (1)](https://github.com/mmyh147/RenewNSell/assets/61750916/74e21d67-9b27-47cf-8486-78bdd1fc397a)

You can view the class diagram [here](https://drive.google.com/file/d/1adlykwsfluoi3I7ytIo0cnQk8RGOMHAK/view?usp=drivesdk).

## Use Case

![UseCaseFinalProject_4 drawio](https://github.com/Ghaliahsalman95/RenewNSell-/assets/159685763/04009fd4-c1b0-4dfc-ab53-39a7ad592cb7)


You can view the use case diagram [here](link_to_use_case).

## Figma Link

You can view the Figma design [here](https://www.figma.com/file/UCHM3h9HjDvOea3peiIJvg/Untitled?type=design&mode=design&t=kRawrEPgMJYnhvna-0).

## Presentation Link

You can view the presentation [here](https://www.canva.com/design/DAGEipSxZN0/646HXCCE4gTsssZVUNkWrw/edit?utm_content=DAGEipSxZN0&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton).

## My Work

  ## FixProduct Model
  
- `FixProductService  -getAll()`
- `FixProductService  -addFixProduct():void`
- `FixProductService  -update():void`
- `FixProductService  -delete()`

- `FixProductService  -acceptPriceFixProduct()`
- `FixProductService  -rejectPriceFixProduct()`
- `FixProductService  -getFixProductOne(): FixProduct`
- `FixProductService  -changeStatus():`

  
  ## OrderCompany Model
  
- `OrderCompanyService -getAll()`
- `OrderCompanyService -add(): void`
- `OrderCompanyService -update(): void`
- `OrderCompanyService -delete(): double`
  
- `OrderCompanyService -changeStatus(): void`
- `OrderCompanyService -findAllByCompanyId(): Set<OrderCompany>`
- `OrderCompanyService -getOrderProductByPercentOfDefective(): List<OrderCompany>`
- `OrderCompanyService -getTotalProfitForOneProduct(): Double`
- `OrderCompanyService -getTotalProfitForOneProductWithFixPrice(): Double`
- `OrderCompanyService -getTotalProfitForOneProductWithOutFixPrice(): Double`
- `OrderCompanyService -getTotalNumberOrdersForOneProduct(): int`
  

  ## OrderProduct Model
  
- `OrderService -getAll(): List<OrderProduct>`
- `OrderService -addOrder(): void`
- `OrderService -updateOrder(): void`
- `OrderService -delete(): void`
  
- `OrderService -buy(): void`
- `OrderService -cancelOrder(): void`
- `OrderService -changeStatus(): void`
- `OrderService -getAllByStatus(): List<OrderProduct>`
- `OrderService -track(): String`
- `OrderService -findAllByCustomer_Id(): Set<OrderProduct>`
- `OrderService -getAllOrderByProductId(): List<OrderProduct>`
- `OrderService -totalOrders(): int`

    ## ResponseFixProduct Model
  
- `ResponseFixProductService -getAll(): List<ResponseFixProduct>`
- `ResponseFixProductService -add(): void`
- `ResponseFixProductService -update(): void`
- `ResponseFixProductService -delete(): void`
- `ResponseFixProductService -response(): void`


