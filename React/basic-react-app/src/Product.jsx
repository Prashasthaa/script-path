import "./Product.css";
import Price from "./Price";
function Product({ title, idx }) {
  let oldPrices = ["12,495", "11,900", "9999", "18,879"];
  let newPrices = ["5,789", "6,789", "1,232", "14,456"];
  let description = [
    ["8,0000 DPI", "5 Programble Button"],
    ["intutive surface", "Desinged for iPad pro"],
    ["desinged for iPad Pro", "intutive surface"],
    ["Wireless", "8,0000 DPI"],
  ];
  return (
    <div className="Product">
      <h4>{title}</h4>
      <p>{description[idx][0]} </p>
      <p>{description[idx][1]} </p>
      <Price oldPrice={oldPrices[idx]} newPrice={newPrices[idx]} />
    </div>
  );
}

export default Product;
