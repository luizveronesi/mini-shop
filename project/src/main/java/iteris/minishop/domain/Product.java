package iteris.minishop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 40)
    private String productName;

    @Column(nullable = false)
    private Double unitPrice;

    @Column(nullable = false, length = 40)
    private String packageName;

    @Column(nullable = false)
    private Boolean isDiscontinued;

    @ManyToOne
    @JoinColumn(name= "SupplierId")
    private Supplier supplier;
}