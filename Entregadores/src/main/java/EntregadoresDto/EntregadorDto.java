package EntregadoresDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntregadorDto(
		@NotBlank Integer id, 
		@NotNull String veiculo, 
		@NotNull Integer matricula, 
		@NotBlank Double capacidadecarga,
		@NotNull String nome) {
}
