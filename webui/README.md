# React + TypeScript + Vite

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react) uses [Babel](https://babeljs.io/) for Fast Refresh
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react-swc) uses [SWC](https://swc.rs/) for Fast Refresh

## React Compiler

The React Compiler is not enabled on this template because of its impact on dev & build performances. To add it, see [this documentation](https://react.dev/learn/react-compiler/installation).

# Vehicle Insurance Calculator - Web UI

A modern, responsive React-based web interface for calculating vehicle insurance premiums.

## Features

- **Intuitive Form Interface**: Clean, modern form with dropdown for vehicle types
- **Smart Validation**:
  - 5-digit postal code validation
  - Annual mileage validation (1-100,000 km)
  - Automatic rounding to nearest 100 km
- **Real-time Updates**: Automatic premium recalculation when form values change
- **Beautiful Results Display**: Elegant premium display with detailed breakdown
- **Responsive Design**: Works perfectly on desktop, tablet, and mobile devices
- **TypeScript Support**: Full type safety throughout the application

## Getting Started

### Prerequisites

- Node.js (v18 or higher)
- npm or yarn
- Backend service running on port 8080

### Installation

1. Navigate to the webui directory:
```bash
cd webui
```

2. Install dependencies:
```bash
npm install
```

3. Start the development server:
```bash
npm run dev
```

4. Open your browser and visit the displayed URL (typically `http://localhost:5173`)

## Usage

1. **Select Vehicle Type**: Choose from Car, Truck, or Motorcycle
2. **Enter Postal Code**: Input a valid 5-digit German postal code
3. **Set Annual Mileage**: Enter expected yearly mileage (automatically rounded to nearest 100)
4. **Calculate Premium**: Click the button to get your insurance quote
5. **Auto-refresh**: After initial calculation, the premium updates automatically when you change values

## Technical Details

### Architecture

- **React 19** with TypeScript for type safety
- **Vite** for fast development and building
- **Custom CSS** with modern styling (gradients, animations, responsive design)
- **Component-based architecture** for maintainability

### Key Components

- `VehiclePricingForm`: Main form with validation and auto-refresh
- `PremiumDisplay`: Beautiful results display with currency formatting
- `PricingService`: API integration layer
- `validation`: Input validation utilities

### API Integration

The frontend communicates with the backend REST API:
- **Endpoint**: `POST /pricing/calculations`
- **Request Format**:
```json
{
  "vehicleType": "CAR",
  "postalCode": "53115",
  "annualMileage": 10000
}
```
- **Response Format**:
```json
{
  "vehicleType": "CAR",
  "postalCode": "53115",
  "annualMileage": 10000,
  "annualPremium": 670.00
}
```

## Build for Production

```bash
npm run build
```

The built files will be in the `dist` directory, ready for deployment.

## Development

### Available Scripts

- `npm run dev` - Start development server
- `npm run build` - Build for production
- `npm run lint` - Run ESLint
- `npm run preview` - Preview production build

### Code Style

- TypeScript strict mode enabled
- ESLint with React and TypeScript rules
- Consistent naming conventions and code organization

## Browser Support

- Chrome (latest)
- Firefox (latest)
- Safari (latest)
- Edge (latest)

## License

This project is part of the Vehicle Insurance Pricing Service challenge.
